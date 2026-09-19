SUMMARY = "Kernel firmware files for Mellanox Spectrum switch driver"
DESCRIPTION = "This package contains kernel firmware files for Mellanox Spectrum switch driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware & GPL-2.0-only"

PV = "20260610"

RPM_NAME = "kernel-firmware-mellanox-20260610-1.2.noarch.rpm"
RPM_HASH = "e4e71ef8d206e1c67d010f176df1764004c88fa43fabde354f7d30a0c0210f7ff1c77202c6c987f57c151c5bf013971d6880e06a47a460713668c8c318a804fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mellanox/lc-ini-bundle-2010-1006.bin \
firmware-mellanox/lc-ini-bundle-2010-1502.bin \
firmware-mellanox/lc-ini-bundle-2010-3020.bin \
firmware-mellanox/lc-ini-bundle-2010-3146.bin \
firmware-mellanox/mlxsw-spectrum-13.1420.122.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1530.152.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1620.192.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1702.6.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1703.4.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.1910.622.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.1122.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.1886.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.2308.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2000.2714.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2014.4012.mfa2 \
firmware-mellanox/mlxsw-spectrum-13.2016.3900.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2000.2308.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2000.2714.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2014.4012.mfa2 \
firmware-mellanox/mlxsw-spectrum2-29.2016.3900.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2007.1168.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1036.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1310.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.1312.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2018.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2304.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2406.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2438.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.2946.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2008.3326.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1006.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1232.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1406.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.1502.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.3020.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2010.3146.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2014.4012.mfa2 \
firmware-mellanox/mlxsw-spectrum3-30.2016.3900.mfa2 \
firmware-mellanox/mlxsw-spectrum4-34.2012.1012.mfa2 \
firmware-mellanox/mlxsw-spectrum4-34.2014.4012.mfa2 \
firmware-mellanox/mlxsw-spectrum4-34.2016.3900.mfa2 \
kernel-firmware-mellanox"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
