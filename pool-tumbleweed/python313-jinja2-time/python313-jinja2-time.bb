SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-jinja2-time-0.2.0-6.4.noarch.rpm"
RPM_HASH = "dcc66797c01f3582611e177bb05a8adec4741c1199947d23d84f47f327cdf709fa26d53fcb1ce5b44269d5fe189d130d742a195e0427100983b3ab03d8c8a7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-time \
python3.13dist-jinja2-time \
python313-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-arrow"

inherit rpm
