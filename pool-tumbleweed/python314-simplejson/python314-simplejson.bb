SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "4.1.1"

RPM_NAME = "python314-simplejson-4.1.1-1.4.aarch64.rpm"
RPM_HASH = "f26b09a4fd55ac7c88a87a1beffc008b33f260e9a52d6b6aad8af76f5d46d6c87bc16a1c18953e89c1b9fb73629c1bf5db1fa44a9c468539ebcf1bbb5febc864"

RPROVIDES:${PN} += "python3.14dist-simplejson \
python314-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
