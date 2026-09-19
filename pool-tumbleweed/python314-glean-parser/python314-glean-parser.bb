SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python314-glean-parser-6.3.0-4.5.noarch.rpm"
RPM_HASH = "a1177c0bce21d8dab58f9fd59043cfc4f7ad7a10f7b2b43d3f5207510f36655afad4eaff49de06cfa4d3d1926c04e39ee3f18e3fe5df5b564c19430486042754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-glean-parser \
python314-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-MarkupSafe \
python314-PyYAML \
python314-appdirs \
python314-click \
python314-diskcache \
python314-jsonschema \
python314-yamllint"

inherit rpm
