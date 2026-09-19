SUMMARY = "Textwrap, but savvy to ANSI colors and styles"
DESCRIPTION = "Ansiwrap wraps text, like the standard textwrap module. \
But it also correctly wraps text that contains ANSI control \
sequences that colorize or style text. \
 \
Where textwrap is fooled by the raw string length of those control codes, \
ansiwrap is not; it understands that however much those codes affect color \
and display style, they have no logical length."
LICENSE = "Apache-2.0"

PV = "0.8.4"

RPM_NAME = "python314-ansiwrap-0.8.4-5.9.noarch.rpm"
RPM_HASH = "16404cb3ff69f2d6bebd7ac727b12cd7a53935c8997119d16d065fa8e80e2fff9c90e4b427a9701830b03d08ef65a1c3f3cd1eaab4e83088dc8c97cb05ee3cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ansiwrap \
python314-ansiwrap \
python3dist-ansiwrap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
