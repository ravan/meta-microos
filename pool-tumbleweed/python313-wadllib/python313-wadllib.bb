SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python313-wadllib-2.1.0-1.1.noarch.rpm"
RPM_HASH = "8f5e0649355d104685638244a7ef78cd5c946132087b7e3ba17e688d897e02bd34956e61c25befa1fd297ea006f843dd33a118436229a6a0f7d397c179e292aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wadllib \
python3.13dist-wadllib \
python313-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python313-lazr.uri"

inherit rpm
