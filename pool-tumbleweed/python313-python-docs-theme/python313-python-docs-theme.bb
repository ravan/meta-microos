SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2026.4"

RPM_NAME = "python313-python-docs-theme-2026.4-1.2.noarch.rpm"
RPM_HASH = "de398951428d926a15b6cb66616fb52e37cbe95afafc2d10e8f3d5e38d9b06d2fc32be624bcf1c5bf3adb46592f919122662433e921dfcdb3ba92d78146e7873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-docs-theme \
python3.13dist-python-docs-theme \
python313-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
