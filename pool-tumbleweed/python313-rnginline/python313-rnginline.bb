SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-rnginline-1.0.0-3.4.noarch.rpm"
RPM_HASH = "5dffa657a9ff2428ee2c8caa97c064da08bd61c85e676f5b74142117b2e52efec536605154df1a15b77d202433c727296064c655873fdc9afbad2da7426004bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnginline \
python3.13dist-rnginline \
python313-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-docopt \
python313-importlib-metadata \
python313-lxml \
python313-typing-extensions \
update-alternatives"

inherit rpm
