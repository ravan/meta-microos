SUMMARY = "Command line interface (cli) for the audible package"
DESCRIPTION = "A command line interface for audible package. With the cli you can download your Audible books, cover, chapter files."
LICENSE = "AGPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "python313-audible-cli-0.6.0-1.1.noarch.rpm"
RPM_HASH = "80f73ed59fcc6b6d60ae464e186de9acecb0d985e0f134d1809e508afc72408856728be25dd29e283462db5227f4ac8ab0d635c930a82cd9f72d626287f0f5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audible-cli \
python3.13dist-audible-cli \
python313-audible-cli \
python3dist-audible-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-aiofiles \
python313-audible \
python313-click \
python313-httpx \
python313-packaging \
python313-questionary \
python313-tabulate \
python313-toml \
python313-tqdm \
update-alternatives"

inherit rpm
