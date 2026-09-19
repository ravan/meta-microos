SUMMARY = "Basic Fonts for Ghostscript"
DESCRIPTION = "Several Type 1 basic PostScript fonts. \
Times, Helvetica, Courier, Symbol, etc. \
Contributed by URW++ Design and Development \
Incorporated, of Hamburg, Germany."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-std-9.06-14.4.noarch.rpm"
RPM_HASH = "fd585fdc081f75b066d399fd14d41ddd65a158e9995387563217910724ee1d998cda55eb8d9cfa9695e6494ede92b4e24070713de67323dcba0f173138f874ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts-std \
urw-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
