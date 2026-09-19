SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies"
DESCRIPTION = "Small and dependency free `Python`_ package to infer file type and MIME \
type checking the `magic numbers`_ signature of a file or buffer. \
 \
This is a Python port from `filetype`_ Go package."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-filetype-1.2.0-3.5.noarch.rpm"
RPM_HASH = "e9074f503c7d75b29c14fbbb67a193d508e816cb324edf7cd802a01100335ca998367c66293b1b26fd1c271d9f3994498055061d81c92318eec6e3ce8923361f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-filetype \
python314-filetype \
python3dist-filetype"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
