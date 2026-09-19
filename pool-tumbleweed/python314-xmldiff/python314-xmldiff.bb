SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "python314-xmldiff-3.0-1.2.noarch.rpm"
RPM_HASH = "009f155907eefd7abaf6c098b8650761c79354cd9a98587f5bc00d531c05db8769f9796e2a2226563b738e2cd43b39fb4c29126f0fbaeb6cad4e1bb695e6734d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xmldiff \
python314-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-lxml \
update-alternatives"

inherit rpm
