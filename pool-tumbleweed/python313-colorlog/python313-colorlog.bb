SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.10.1"

RPM_NAME = "python313-colorlog-6.10.1-1.4.noarch.rpm"
RPM_HASH = "943c19a8c8501686d974334afcda567c7942e7e897c433e1b2edf06c3a34aadcbe4ad2753634e7c7b7763e3d55ca1dee49e5563a6074f4893fd3561b3f467b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorlog \
python3.13dist-colorlog \
python313-colorlog \
python3dist-colorlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
