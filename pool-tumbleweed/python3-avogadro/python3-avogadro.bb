SUMMARY = "Python bindings for Avogadro libraries"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "Apache-2.0 & BSD-3-Clause & CDDL-1.0 & GPL-3.0-or-later"

PV = "1.100.0"

RPM_NAME = "python3-avogadro-1.100.0-3.6.aarch64.rpm"
RPM_HASH = "b75e313bcfb23cf099b11f620af73f4182a674622b21ec7100466cc8f67be00fd0cf21feb0dd27bccec9a09db8ce9a89db5102c0c7d9a123f0f182d54087efcf"

RPROVIDES:${PN} += "python3-avogadro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroQuantumIO.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
