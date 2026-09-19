SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "python314-html5-parser-0.4.12-2.8.aarch64.rpm"
RPM_HASH = "6b990d79dbe09c1267f133f18eaeb1aedbba833c94569867e28202dbaaa48f06d37b0c315e694bd74d680433287730a650c555279357133adc26a855c3f83d9e"

RPROVIDES:${PN} += "python3.14dist-html5-parser \
python314-html5-parser \
python3dist-html5-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
python-abi"

inherit rpm
