/*
 * Encog(tm) Core v3.2 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2012 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.ml.genetic;

import org.encog.ml.genetic.crossover.Crossover;
import org.encog.ml.genetic.genome.CalculateGenomeScore;
import org.encog.ml.genetic.genome.Genome;
import org.encog.ml.genetic.mutate.Mutate;
import org.encog.ml.genetic.population.Population;
import org.encog.ml.genetic.sort.GenomeComparator;
import org.encog.util.concurrency.MultiThreadable;

/**
 * Implements a genetic algorithm. This is an abstract class. Other classes are
 * provided by Encog use this base class to train neural networks or provide an
 * answer to the traveling salesman problem.
 * 
 * The genetic algorithm is also capable of using a thread pool to speed
 * execution.
 */
public abstract interface GeneticAlgorithm  extends MultiThreadable {

	CalculateGenomeScore getCalculateScore();

	GenomeComparator getComparator();

	Crossover getCrossover();

	void setCalculateScore(CalculateGenomeScore theCalculateScore);

	void setComparator(GenomeComparator theComparator);

	void calculateScore(Genome g);

	double getMutationPercent();

	Mutate getMutate();

	void setPopulation(Population thePopulation);

	Population getPopulation();

	void setMutationPercent(double theMutationPercent);

	void setPercentToMate(double thePercentToMate);

	void setCrossover(Crossover theCrossover);

	void setMatingPopulation(double theMatingPopulation);

	void setMutate(Mutate theMutate);

	void iteration();
	

	
}
