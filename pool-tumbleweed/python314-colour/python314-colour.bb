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

RPM_NAME = "python314-colour-0.1.5-4.12.noarch.rpm"
RPM_HASH = "b3352b5eda4c0103786d6e4edc3a0781ff9ba576a1c57f980fccfbcdc91036223340530edd6b7ebb404f78a85ed69462cf603673b6c5ab38e3546e239602fc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colour \
python314-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
