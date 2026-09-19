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

RPM_NAME = "python313-pymol-3.1.0-4.9.aarch64.rpm"
RPM_HASH = "6595e213fc41bd868ea0c993f0abdfaa7a3d2a291adca79fd7ee4d6afc9c9ca31709ff151ed011a52e53620bcbe00eb840c41ed00d2c33578e4094ce2390db63"

RPROVIDES:${PN} += "pymol \
python3-pymol \
python3.13dist-pymol \
python313-pymol \
python3dist-pymol"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
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
python313-numpy \
update-alternatives"

inherit rpm
