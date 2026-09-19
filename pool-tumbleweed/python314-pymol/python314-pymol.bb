SUMMARY = "A Molecular Viewer"
DESCRIPTION = "PyMOL is a molecular graphics system targetted at medium to large \
biomolecules like proteins. It can generate molecular graphics \
images and animations. \
 \
Features include: \
 \
* Visualization of molecules, molecular trajectories and surfaces \
  of crystallography data or orbitals \
* Molecular builder and sculptor \
* Internal raytracer and movie generator \
* Fully extensible and scriptable via a python interface \
 \
The file formats PyMOL can read include PDB, XYZ, CIF, MDL Molfile, \
ChemDraw, CCP4 maps, XPLOR maps and Gaussian cube maps."
LICENSE = "Python-2.0"

PV = "3.1.0"

RPM_NAME = "python314-pymol-3.1.0-4.9.aarch64.rpm"
RPM_HASH = "09c6933fa1201473bb122e74b03cd00b87642c475c971e39f33052f686f67e1db8b8f1c03ae4578985f953ee83f8f500d6be9a33223a26dfcb83b5f65c1a5bc4"

RPROVIDES:${PN} += "pymol \
python3.14dist-pymol \
python314-pymol \
python3dist-pymol"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.3 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libnetcdf.so.22 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.16 \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
