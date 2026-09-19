SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python313-pylint-ignore-2022.1025-4.5.noarch.rpm"
RPM_HASH = "0d40a6357ee3117dd19bbf7f8166a5170823f08e8b02a44bb49ce1268dafab8b0f085854c88e0f059f894b5c9959cbb8d897613a938a9c5bf8e224dd65ecb72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-ignore \
python3.13dist-pylint-ignore \
python313-pylint-ignore \
python3dist-pylint-ignore"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-astroid \
python313-pylev \
python313-pylint"

inherit rpm
