SUMMARY = "Digital Forensics Artifact Repository"
DESCRIPTION = "A community-sourced, machine-readable knowledge base of forensic \
artifacts that can be used both as an information source and within \
other tools. \
 \
Using artifacts in tools just requires reading YAML. (The Python code \
in the project is merely used to validate that the artifacts follow \
the specification.) \
 \
For some background on the artifacts system and how its developers \
expect it to be used, see the BlackHat presentation and Youtube video \
from the GRR team."
LICENSE = "Apache-2.0"

PV = "20221219"

RPM_NAME = "artifacts-20221219-4.4.noarch.rpm"
RPM_HASH = "fccdcc3e40028d89f9526fd9d27ac75cdfc45b8832577a338f176eb6f9e289f00fda072162eddfc4ccc99f021b3dc4b5189276953a822b4531b5da3148081707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts"

RDEPENDS:${PN} += ""

inherit rpm
