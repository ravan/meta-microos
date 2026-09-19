SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package and ensures all dependencies required \
for full functionality are provided. In addition, it provides the command 'typer' \
which allows users to run scripts not using typer with the same command line comfort \
as those that do."
LICENSE = "MIT"

PV = "0.27.2"

RPM_NAME = "python313-typer-0.27.2-1.1.noarch.rpm"
RPM_HASH = "15bccdb7ee2c479378bb210c3f9a71ee035bf5b01ea13f9316dadf9f11ed2e2e8fbcfe11b47dffd6f94c6af4fabe22a84cf4c5f7092f3caed5685b1379d7f235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typer \
python3-typer-slim \
python3.13dist-typer \
python313-typer \
python313-typer-slim \
python3dist-typer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-annotated-doc \
python313-rich \
python313-shellingham"

inherit rpm
