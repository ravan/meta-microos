SUMMARY = "Metaheuristic modeling framework and optimization toolkit in modern C++"
DESCRIPTION = "METSlib is a metaheuristic modeling framework and optimization \
toolkit in C++. \
 \
Model and algorithms are modular: any search algorithm can be applied \
to the same model. On the other hand, no assumption is made on the \
model, any problem type can be worked on: timetabling, assignment \
problems, vehicle routing, bin-packing and so on. \
 \
Once the model is implemented in the problem framework, the library \
allows testing of different Taboo Search strategies or even different \
algorithms (Simulated Annealing or other local search based \
algorithms) with a few lines of code."
LICENSE = "CPL-1.0 | GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "metslib-devel-0.5.3-3.8.noarch.rpm"
RPM_HASH = "1feeeb4a359fcce8a5e983b5d91f9554f382380c22c622c036f9a44ead7d25cb53ffd0158c716154ba2b0ed1978af89df1671de3fa72d9443f202f13edb0b9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-devel \
pkgconfig-metslib"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
