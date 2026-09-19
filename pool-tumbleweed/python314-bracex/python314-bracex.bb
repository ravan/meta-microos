SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-bracex-3.0.1-1.1.noarch.rpm"
RPM_HASH = "a331544aac0db5632faee2b91456f0a237b510699ab9fb9dc380c6189fade3dba7e3dff94fdc9531232648e026ab0c83b48ec5474a10bab0f7341ae94b866ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bracex \
python314-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
