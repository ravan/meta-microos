SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python313-pdfrw-0.4-5.5.noarch.rpm"
RPM_HASH = "d47ec2f416ca3d805b5d8c939d844f0ba28cb571d45919113a3dbd454f89ddd98ccce3e558675a6f39ac7fae0fb9276ed54e3eb70980d17e151d70184988eafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfrw \
python3.13dist-pdfrw \
python313-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
