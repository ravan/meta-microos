SUMMARY = "Python module to convert between color representations (RGB, HSL, web)"
DESCRIPTION = "Python module to convert between color representations: \
  * RGB, HSL, 6-digit hex, 3-digit hex, human color \
  * One object (Color) or several single purpose functions \
    (rgb2hex, hsl2rgb, ...) \
  * Web format which uses the smallest representation between \
    6-digit (e.g. #fa3b2c), 3-digit (e.g. #fbb), fully spelled \
    color (e.g. white), following W3C color naming for compatible \
    CSS or HTML color specifications \
  * Color scale generation choosing N color gradients \
  * It's possible to pick colors to identify objects of the \
    application being developed"
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "python313-colour-0.1.5-4.12.noarch.rpm"
RPM_HASH = "0b1109e3ba3f2a44e3499370f8e4b38b42c68ee16df1544114779c3dbd3c66b10bc1c099777c3056ff6cc90642057484edbdd5e48898d08ab3e24db45634beeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colour \
python3.13dist-colour \
python313-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
