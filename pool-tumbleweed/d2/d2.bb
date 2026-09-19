SUMMARY = "CLI tool and modern declarative language that turns text to diagrams"
DESCRIPTION = "A modern declarative diagramming language that turns text to diagrams. Create \
beautiful diagrams in minutes. Simple syntax. Endlessly customizable. D2 is the \
fastest and easiest way to get a mental model from your head onto the screen, \
then make edits with your team."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & EPL-2.0 & GPL-2.0-or-later & BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "d2-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "37933bf8b507e5f19f57e8471b7d45d00379cf327128d6ed4cdfecec2254d1843edcb0dd68baf0c3220af98cd3ebe62833975aca19dc6c06f44f40c9977c641c"

RPROVIDES:${PN} += "d2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
