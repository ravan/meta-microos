SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-mando-0.8.2-1.3.noarch.rpm"
RPM_HASH = "2f848588728580fd87bc72d55077d9b8e3f1b4d0ef5a7559979797af02f76ff2b186e46d3050728dbe993d2fef48e35be234efffb59aff5164e8551c930f0086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mando \
python314-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi"

inherit rpm
