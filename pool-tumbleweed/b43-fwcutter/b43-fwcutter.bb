SUMMARY = "Tool for extracting firmware from newer Broadcom WLAN drivers"
DESCRIPTION = "b43-fwcutter can be used to extract firmware from Windows WLAN drivers \
for Broadcom bcm43xx devices. The firmware is necessary to run such a \
card under Linux using the b43 or b43legacy driver."
LICENSE = "BSD-2-Clause"

PV = "019"

RPM_NAME = "b43-fwcutter-019-7.5.aarch64.rpm"
RPM_HASH = "f526ab82e700af10bf3e025f86e97de6fb84030629751cd599a1c29dd235c17ce2de101647f4cadb24511d9ade6fdb684268a83ca97036941f68db81077636b0"

RPROVIDES:${PN} += "b43-fwcutter \
bcm43xx-fwcutter \
firmware-b43/a0g0bsinitvals5.fw \
firmware-b43/a0g0bsinitvals9.fw \
firmware-b43/a0g0initvals5.fw \
firmware-b43/a0g0initvals9.fw \
firmware-b43/a0g1bsinitvals13.fw \
firmware-b43/a0g1bsinitvals5.fw \
firmware-b43/a0g1bsinitvals9.fw \
firmware-b43/a0g1initvals13.fw \
firmware-b43/a0g1initvals5.fw \
firmware-b43/a0g1initvals9.fw \
firmware-b43/b0g0bsinitvals13.fw \
firmware-b43/b0g0bsinitvals5.fw \
firmware-b43/b0g0bsinitvals9.fw \
firmware-b43/b0g0initvals13.fw \
firmware-b43/b0g0initvals5.fw \
firmware-b43/b0g0initvals9.fw \
firmware-b43/lp0bsinitvals13.fw \
firmware-b43/lp0bsinitvals14.fw \
firmware-b43/lp0bsinitvals15.fw \
firmware-b43/lp0bsinitvals16.fw \
firmware-b43/lp0initvals13.fw \
firmware-b43/lp0initvals14.fw \
firmware-b43/lp0initvals15.fw \
firmware-b43/lp0initvals16.fw \
firmware-b43/n0absinitvals11.fw \
firmware-b43/n0bsinitvals11.fw \
firmware-b43/n0bsinitvals16.fw \
firmware-b43/n0initvals11.fw \
firmware-b43/n0initvals16.fw \
firmware-b43/pcm5.fw \
firmware-b43/sslpn0bsinitvals16.fw \
firmware-b43/sslpn0initvals16.fw \
firmware-b43/sslpn1bsinitvals20.fw \
firmware-b43/sslpn1initvals20.fw \
firmware-b43/sslpn2bsinitvals17.fw \
firmware-b43/sslpn2bsinitvals19.fw \
firmware-b43/sslpn2initvals17.fw \
firmware-b43/sslpn2initvals19.fw \
firmware-b43/sslpn4bsinitvals22.fw \
firmware-b43/sslpn4initvals22.fw \
firmware-b43/ucode11.fw \
firmware-b43/ucode13.fw \
firmware-b43/ucode14.fw \
firmware-b43/ucode15.fw \
firmware-b43/ucode16-lp.fw \
firmware-b43/ucode16-mimo.fw \
firmware-b43/ucode16-sslpn-nobt.fw \
firmware-b43/ucode16-sslpn.fw \
firmware-b43/ucode17.fw \
firmware-b43/ucode19.fw \
firmware-b43/ucode20.fw \
firmware-b43/ucode22-sslpn.fw \
firmware-b43/ucode5.fw \
firmware-b43/ucode9.fw \
firmware-b43legacy/a0g0bsinitvals2.fw \
firmware-b43legacy/a0g0bsinitvals5.fw \
firmware-b43legacy/a0g0initvals2.fw \
firmware-b43legacy/a0g0initvals5.fw \
firmware-b43legacy/a0g1bsinitvals5.fw \
firmware-b43legacy/a0g1initvals5.fw \
firmware-b43legacy/b0g0bsinitvals2.fw \
firmware-b43legacy/b0g0bsinitvals5.fw \
firmware-b43legacy/b0g0initvals2.fw \
firmware-b43legacy/b0g0initvals5.fw \
firmware-b43legacy/pcm4.fw \
firmware-b43legacy/pcm5.fw \
firmware-b43legacy/ucode11.fw \
firmware-b43legacy/ucode2.fw \
firmware-b43legacy/ucode4.fw \
firmware-b43legacy/ucode5.fw"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
