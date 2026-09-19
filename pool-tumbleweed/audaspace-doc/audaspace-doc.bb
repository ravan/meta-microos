SUMMARY = "Documentation for audaspace"
DESCRIPTION = "The audaspace-doc package contains documentation for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-doc-1.10.0-1.1.noarch.rpm"
RPM_HASH = "4d44b3eab5bf06fc9e9625dfa9d6ea953a2dc42cb7557b5b5ac0c6d83bbf3ecba7e7a2bdef086766531efcf11483b2923d872df1057942b497907b06b1f0a3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audaspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
