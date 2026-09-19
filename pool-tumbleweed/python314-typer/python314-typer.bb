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

RPM_NAME = "python314-typer-0.27.2-1.1.noarch.rpm"
RPM_HASH = "f11e36aee3af74625607618cb8606a38618fe0367270a5f731a4de99fb288aa6e04060fd4e3f3973b2c982bb8c7f6d1ae56b8429f2665db5de629a633bc52621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typer \
python314-typer \
python314-typer-slim \
python3dist-typer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-annotated-doc \
python314-rich \
python314-shellingham"

inherit rpm
