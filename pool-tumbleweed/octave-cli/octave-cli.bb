SUMMARY = "Command-line user interface for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains the command-line user interface."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.0"

RPM_NAME = "octave-cli-11.3.0-1.2.aarch64.rpm"
RPM_HASH = "959b977e13a8721f141dd9ff73cd1057bc0eb7d162f3d9700498de970d5c2f3f6be4056a3bcbb6e8a6eade3ae5348edb5bae8bc44dae5b7c47e0c7e6acd10643"

RPROVIDES:${PN} += "config-octave-cli \
liboctave.so.13 \
liboctinterp.so.15 \
liboctmex.so.1 \
octave-api-v61 \
octave-cli"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libGraphicsMagick++-Q16.so.12 \
libGraphicsMagick-Q16.so.3 \
libX11.so.6 \
libamd.so.3 \
libarpack.so.2 \
libbz2.so.1 \
libc.so.6 \
libccolamd.so.3 \
libcholmod.so.5 \
libcolamd.so.3 \
libcurl.so.4 \
libcxsparse.so.4 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfltk-gl.so.1.3 \
libfltk.so.1.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgl2ps.so.1 \
libglpk.so.40 \
libgomp.so.1 \
libhdf5.so.310 \
libm.so.6 \
libopenblas.so.0 \
libpcre2-8.so.0 \
libportaudio.so.2 \
libqhull-r.so.8.0 \
libqrupdate.so.1 \
libreadline.so.8 \
libsndfile.so.1 \
libspqr.so.4 \
libstdc++.so.6 \
libsuitesparseconfig.so.7 \
libsundials-core.so.7 \
libsundials-ida.so.7 \
libsundials-ida7 \
libsundials-sunlinsol5 \
libsundials-sunlinsolklu.so.5 \
libumfpack.so.6 \
libwayland-client.so.0 \
libz.so.1 \
makeinfo \
update-alternatives"

inherit rpm
