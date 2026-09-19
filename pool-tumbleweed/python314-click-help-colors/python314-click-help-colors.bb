SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python314-click-help-colors-0.9.4-2.5.noarch.rpm"
RPM_HASH = "f00610086a7bb97a0b91976dc445b8199653be64fe966d728d482dcbb3e6e061c0916dce98091f2e3a4681b5a0e3da59e5b8839343a7eed5311a40eeb1e2033b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-help-colors \
python314-click-help-colors \
python3dist-click-help-colors"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
