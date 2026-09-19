SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python313-Jinja2-3.1.6-2.5.aarch64.rpm"
RPM_HASH = "77fd1fe73ac15338a214779d0fe8e607c733e6913714f216e4f9533f831d28fe16228f94b3df062ed44ce733fb88cbcf41bcd0e9742f91b867e3abf889695216"

RPROVIDES:${PN} += "python3-Jinja2 \
python3-jinja2 \
python3.13dist-jinja2 \
python313-Jinja2 \
python313-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python313-MarkupSafe"

inherit rpm
