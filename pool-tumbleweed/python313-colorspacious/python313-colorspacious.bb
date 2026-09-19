SUMMARY = "Python library for doing colorspace conversions"
DESCRIPTION = "Colorspacious is a library for performing colorspace conversions. \
 \
In addition to the most common standard colorspaces (sRGB, XYZ, xyY, \
CIELab, CIELCh), it also includes color vision deficiency ('color \
blindness') simulations using the approach of Machado et al (2009), a \
complete implementation of CIECAM02 \
<https://en.wikipedia.org/wiki/CIECAM02>, and the perceptually \
uniform CAM02-UCS / CAM02-LCD / CAM02-SCD spaces proposed by Luo et al \
(2006)."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-colorspacious-1.1.2-3.5.noarch.rpm"
RPM_HASH = "74c9baa57be71bb4fdbe8869ee204c74856c0e535a5682031708c2855b3970a36b285c40900e5c7091a8e025876a4ba8a6694409cab8eb4751a2c30b0a4c7942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorspacious \
python3.13dist-colorspacious \
python313-colorspacious \
python3dist-colorspacious"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
