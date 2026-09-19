SUMMARY = "GAP: Wedderburn Decomposition of Group Algebras"
DESCRIPTION = "Wedderga is the package to compute the simple components of the \
Wedderburn decomposition of semisimple group algebras of finite \
groups over finite fields and over subfields of finite cyclotomic \
extensions of the rational. It also contains functions that produce \
the primitive central idempotents of semisimple group algebras. Other \
functions of Wedderga allows to construct crossed products over a \
group with coefficients in an associative ring with identity and the \
multiplication determined by a given action and twisting."
LICENSE = "GPL-2.0-or-later"

PV = "4.12.1"

RPM_NAME = "gap-wedderga-4.12.1-1.1.noarch.rpm"
RPM_HASH = "34dbe090441e5ed92ec2d307f4fabf8fc9560fff961489331b0981abb1dd12e6c7d2f4a065c59597f0b0d70c4ba5dc1adc4a0bc395d7915860296d1dde5d383c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-wedderga"

RDEPENDS:${PN} += "gap-core"

inherit rpm
