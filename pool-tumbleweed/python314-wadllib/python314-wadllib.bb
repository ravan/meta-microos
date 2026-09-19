SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python314-wadllib-2.1.0-1.1.noarch.rpm"
RPM_HASH = "a646ed3402e3ca7a1efb066bb6a0ed0cd6db27e10bc49227f375a33f7877c0ce8bfb972d610c6fe07cc21834bbe138b786c0d271c9f7c2e27fd2883792627781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wadllib \
python314-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python314-lazr.uri"

inherit rpm
