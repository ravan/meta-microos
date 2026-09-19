SUMMARY = "Sound synthesis and audio signal processing environment"
DESCRIPTION = "Cecilia is a graphic user interface for the sound synthesis and sound \
processing package CSound. Cecilia enables the user to build very \
quickly graphic interfaces with sliders and curves to control CSound \
instruments. It is also an editor to CSound with syntax highlighting \
and a built-in reference. It is also a great tool to explore the parameters \
of a new opcode in an interactive and intuitive way. \
 \
Cecilia uses the pyo audio engine created for the Python programming language. \
 \
Cecilia was designed by and for musicians and sound designers. All \
the traditional sound processing devices are included such as EQs, \
compressors and delays adapted for the most simple applications and \
the wildest imaginable sonic contortions."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.1"

RPM_NAME = "cecilia-5.4.1-2.9.noarch.rpm"
RPM_HASH = "92bfa94a90b65ac0079e1dd354a8f8d3e3ea281f4ecda97694b3892450c214f7a0762e2005eb2ed14f0a63ad4df3ece71f482e1faaffedc6e39001bb41f6e958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cecilia \
python3.13dist-cecilia \
python3dist-cecilia"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-numpy \
python3-pyo \
python3-wxPython"

inherit rpm
