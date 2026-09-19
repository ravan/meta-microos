SUMMARY = "Pegasus Workflow Management System Python API"
DESCRIPTION = "This package contains the Python APIs for Pegasus WMS, including: \
 \
The DAX API (Versions 2 and 3) \
The PDAX API (Version 2) \
The monitoring API \
The Stampede database API \
The Pegasus statistics API \
The Pegasus plots API \
Misc. Pegasus utilities \
The pegasus service, including the ensemble manager and dashboard"
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python313-pegasus-wms.api-5.1.2-1.2.noarch.rpm"
RPM_HASH = "c35e157e74e19f80cccb9350e39d8e05123cf592d65d5f1848f26ddb3965ecef222acd96080213a3a9444ad7f8983f901f3e64d551ae2804ca1fd18c74c01348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.api \
python3.13dist-pegasus-wms.api \
python313-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python313-pegasus-wms.common"

inherit rpm
