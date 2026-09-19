SUMMARY = "Parser tools for Mozilla's Glean telemetry"
DESCRIPTION = "Parser tools for Mozilla's Glean telemetry"
LICENSE = "MPL-2.0"

PV = "6.3.0"

RPM_NAME = "python313-glean-parser-6.3.0-4.5.noarch.rpm"
RPM_HASH = "d7ba905003153dbfb409471cf9b6b83594836e2c376195c15937b3894bc78d9cc9b2dffd4d5a401099d666051136d10c0fac104c11bc78ed322673c550c4b1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean-parser \
python3.13dist-glean-parser \
python313-glean-parser \
python3dist-glean-parser"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-MarkupSafe \
python313-PyYAML \
python313-appdirs \
python313-click \
python313-diskcache \
python313-jsonschema \
python313-yamllint"

inherit rpm
