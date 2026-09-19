SUMMARY = "Mathematical modelling to visualise implicit and parametric surfaces"
DESCRIPTION = "MathMod is a mathematical modeling software to model, plot and animate \
3D/4D parametric and implicit surfaces. \
 \
Features: \
 * 3D and 4D plotting and animation \
 * OBJ output file format \
 * Scripting language in JSON file format \
 * Texture and pigmentation support \
 * Noise and Turbulence effects support \
 * Large set of scripted examples"
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "mathmod-12.0-1.8.aarch64.rpm"
RPM_HASH = "6da87fdd14176bbdbc52eb32247c559281aa172d0edc25df57b2fe730b2f5a0d0704be6e022bf0283730a5b081c1e30330b670774071b29fb63b3d27b64e15fc"

RPROVIDES:${PN} += "mathmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
