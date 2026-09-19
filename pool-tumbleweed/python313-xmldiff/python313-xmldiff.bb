SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "python313-xmldiff-3.0-1.2.noarch.rpm"
RPM_HASH = "23653384beaeb2995c336aa62be6c1ada396cb42f9c4ef2901d380304dd8682a6c565e1ad306f658b0d002bbad5a1e4ae6dd838e1a8377b3aedc76d09553f6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmldiff \
python3.13dist-xmldiff \
python313-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-lxml \
update-alternatives"

inherit rpm
