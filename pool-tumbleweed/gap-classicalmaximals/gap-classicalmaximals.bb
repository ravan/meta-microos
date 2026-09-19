SUMMARY = "GAP: Maximal subgroups of the classical quasisimple groups"
DESCRIPTION = "The ClassicalMaximals function returns a list of the maximal \
subgroups of the classical quasisimple groups in their natural \
representations. The list should be complete for dimensions up to 17. \
For larger dimensions, all maximal subgroups of geometric type are \
returned, but not those of Type S (sometimes known as Class C9). \
 \
There are also options to return the normalisers of these subgroups \
in various groups, such as (GL)(n, q), (CU)(n, q), that lie between \
the quasisimple group and its normaliser in the general linear group. \
These should be sufficient to enable the skilled user to determine \
the maximal subgroups of any group lying between the quasisimple \
groups and its normaliser."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "gap-classicalmaximals-1.1-1.1.noarch.rpm"
RPM_HASH = "688aee3fec2810273dc99839f9db171701bc323af71ffcb64b8370b03d0a352a83035e90030be98161a4b939120778621829d8374066d5772bb546b08764e3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-classicalmaximals"

RDEPENDS:${PN} += "gap-core \
gap-forms \
gap-recog"

inherit rpm
