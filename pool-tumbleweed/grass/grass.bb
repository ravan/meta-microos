SUMMARY = "Geographic Resources Analysis Support System"
DESCRIPTION = "GRASS (Geographic Resources Analysis Support System), commonly \
referred to as GRASS, is a Geographic Information System \
(GIS) used for geospatial data management and analysis, image \
processing, graphics/maps production, spatial modeling, and \
visualization. GRASS is currently used in academic and commercial \
settings around the world, as well as by many governmental agencies \
and environmental consulting companies."
LICENSE = "GPL-2.0-or-later"

PV = "8.5.0"

RPM_NAME = "grass-8.5.0-1.1.aarch64.rpm"
RPM_HASH = "2c8b80d7e7c074ca2e2ed28268ccdf5bac90720f4f9f835ceb2f7d55e9ce4c656be5198f1460411481e31fad42a804fbad7d49fc04b645904eb9c5552eefd891"

RPROVIDES:${PN} += "config-grass \
grass \
libgrass-arraystats.8.5.so \
libgrass-bitmap.8.5.so \
libgrass-btree.8.5.so \
libgrass-btree2.8.5.so \
libgrass-cairodriver.8.5.so \
libgrass-calc.8.5.so \
libgrass-ccmath.8.5.so \
libgrass-cdhc.8.5.so \
libgrass-cluster.8.5.so \
libgrass-datetime.8.5.so \
libgrass-dbmibase.8.5.so \
libgrass-dbmiclient.8.5.so \
libgrass-dbmidriver.8.5.so \
libgrass-dbstubs.8.5.so \
libgrass-dgl.8.5.so \
libgrass-dig2.8.5.so \
libgrass-display.8.5.so \
libgrass-driver.8.5.so \
libgrass-dspf.8.5.so \
libgrass-g3d.8.5.so \
libgrass-gis.8.5.so \
libgrass-gmath.8.5.so \
libgrass-gpde.8.5.so \
libgrass-gproj.8.5.so \
libgrass-htmldriver.8.5.so \
libgrass-imagery.8.5.so \
libgrass-interpdata.8.5.so \
libgrass-interpfl.8.5.so \
libgrass-iortho.8.5.so \
libgrass-iostream.8.5.so \
libgrass-lidar.8.5.so \
libgrass-linkm.8.5.so \
libgrass-lrs.8.5.so \
libgrass-manage.8.5.so \
libgrass-neta.8.5.so \
libgrass-nviz.8.5.so \
libgrass-ogsf.8.5.so \
libgrass-parson.8.5.so \
libgrass-pngdriver.8.5.so \
libgrass-psdriver.8.5.so \
libgrass-qtree.8.5.so \
libgrass-raster.8.5.so \
libgrass-rli.8.5.so \
libgrass-rowio.8.5.so \
libgrass-rtree.8.5.so \
libgrass-segment.8.5.so \
libgrass-shape.8.5.so \
libgrass-sim.8.5.so \
libgrass-sqlp.8.5.so \
libgrass-stats.8.5.so \
libgrass-symb.8.5.so \
libgrass-temporal.8.5.so \
libgrass-vector.8.5.so \
libgrass-vedit.8.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libfftw3.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libgeos-c.so.1 \
libgomp.so.1 \
libm.so.6 \
libmariadb.so.3 \
libnetcdf.so.22 \
libodbc.so.2 \
libopenblas.so.0 \
libpdalcpp.so.20 \
libpng16.so.16 \
libpq.so.5 \
libproj.so.25 \
libreadline.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
libzstd.so.1 \
proj \
python3-dateutil \
python3-numpy \
python3-opengl \
python3-wxPython \
python3-xml \
sqlite \
unixODBC \
xterm"

inherit rpm
