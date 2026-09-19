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

RPM_NAME = "python314-colorspacious-1.1.2-3.5.noarch.rpm"
RPM_HASH = "0ba592b221c7d7b5ea25cbbe1a040f583175736e9e8e02843388f6b94f6895efc004ace26a8e2cce51d236088a43ceace805936007d1c26b5381303b3b360dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorspacious \
python314-colorspacious \
python3dist-colorspacious"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
