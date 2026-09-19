SUMMARY = "GAP: Lie AlGebras and UNits of group Algebras"
DESCRIPTION = "LAGUNA extends GAP functionality for computations in group rings. \
Besides computing some general properties and attributes of group \
rings and their elements, LAGUNA is able to perform two main kinds of \
computations. Namely, it can verify whether a group algebra of a \
finite group satisfies certain Lie properties; and it can calculate \
the structure of the normalized unit group of a group algebra of a \
finite p-group over the field of p elements."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.1"

RPM_NAME = "gap-laguna-3.10.1-1.1.noarch.rpm"
RPM_HASH = "aad4c2dc9f37b773ccf3c7492c44e24429c6d4b05e44592acf0653e283377235b5d80da99bb8a5ccd6b338a8ad000439bc26bc04cbbe5696b404cbae91a584b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-laguna"

RDEPENDS:${PN} += "gap-core"

inherit rpm
