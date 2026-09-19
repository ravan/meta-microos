SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python314-pylint-ignore-2022.1025-4.5.noarch.rpm"
RPM_HASH = "8c15cd76a9a78567114cd18e0df372d68ed01ff3bef5e45619b6d41d90d26c9992caf951a5a2ea7ee64d60ef2c428f5acdb1f17b1857558a0b1ad13733db1c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylint-ignore \
python314-pylint-ignore \
python3dist-pylint-ignore"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-astroid \
python314-pylev \
python314-pylint"

inherit rpm
