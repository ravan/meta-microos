SUMMARY = "Perl interface to the ISAAC PRNG algorithm"
DESCRIPTION = "As with other Pseudo-Random Number Generator (PRNG) algorithms like the \
Mersenne Twister (see Math::Random::MT), this algorithm is designed to \
take some seed information and produce seemingly random results as output. \
However, ISAAC (Indirection, Shift, Accumulate, Add, and Count) has \
different goals than these commonly used algorithms. In particular, it's \
really fast - on average, it requires only 18.75 machine cycles to \
generate a 32-bit value. This makes it suitable for applications where a \
significant amount of random data needs to be produced quickly, such \
solving using the Monte Carlo method or for games. \
The results are uniformly distributed, unbiased, and unpredictable unless \
you know the seed. The algorithm was published by Bob Jenkins in the late \
90s and despite the best efforts of many security researchers, no feasible \
attacks have been found to date."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "1.004"

RPM_NAME = "perl-Math-Random-ISAAC-1.004-2.34.noarch.rpm"
RPM_HASH = "c310f100bc72aa21376054ce51a3311a2f3ef0424ce619dd3ad215c02c88bee5c6fd294a639b4912cb8f7deda2da87c10d04352686661d891084a14c5e8f2ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Random--ISAAC \
perl-Math--Random--ISAAC--PP \
perl-Math-Random-ISAAC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
