SUMMARY = "Command line interface (cli) for the audible package"
DESCRIPTION = "A command line interface for audible package. With the cli you can download your Audible books, cover, chapter files."
LICENSE = "AGPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "python314-audible-cli-0.6.0-1.1.noarch.rpm"
RPM_HASH = "49ec26b4fbc40cf2f192c2a3d832555bde1806ae92f8013a87826e1bd7476931bf78d815f1a94be54e9faef445d41627dda9696b900aecd9e58d62663acabf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-audible-cli \
python314-audible-cli \
python3dist-audible-cli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-aiofiles \
python314-audible \
python314-click \
python314-httpx \
python314-packaging \
python314-questionary \
python314-tabulate \
python314-toml \
python314-tqdm \
update-alternatives"

inherit rpm
