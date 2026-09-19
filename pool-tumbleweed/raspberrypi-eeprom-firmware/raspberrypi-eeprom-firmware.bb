SUMMARY = "Raspberry Pi 4 EEPROM firmware blobs"
DESCRIPTION = "First stage bootloader fimware blobs for Raspberry Pi 4 and Pi 5"
LICENSE = "SUSE-Firmware"

PV = "2026.01.09"

RPM_NAME = "raspberrypi-eeprom-firmware-2026.01.09-1.2.noarch.rpm"
RPM_HASH = "fce964a9a18ccb9b6b429b9698c4e8ba42cef038496dc140f6ca6e6c7f8208f0962e73dc4fc181c58c983b23d436a794ae0bab3e5f7974a8f29f86f4d51974ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-raspberrypi/bootloader-2711/default/pieeprom-2025-05-08.bin \
firmware-raspberrypi/bootloader-2711/default/pieeprom-2025-11-05.bin \
firmware-raspberrypi/bootloader-2711/default/pieeprom-2025-12-08.bin \
firmware-raspberrypi/bootloader-2711/default/pieeprom-2026-01-09.bin \
firmware-raspberrypi/bootloader-2711/default/recovery.bin \
firmware-raspberrypi/bootloader-2711/default/vl805-000138c0.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-05-08.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-05-16.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-07-03.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-07-17.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-08-13.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-08-20.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-08-27.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-09-22.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-09-23.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-10-03.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-10-08.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-10-14.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-11-05.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-11-21.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-11-27.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2025-12-08.bin \
firmware-raspberrypi/bootloader-2711/latest/pieeprom-2026-01-09.bin \
firmware-raspberrypi/bootloader-2711/latest/recovery.bin \
firmware-raspberrypi/bootloader-2711/latest/vl805-000138c0.bin \
firmware-raspberrypi/bootloader-2712/default/pieeprom-2025-05-08.bin \
firmware-raspberrypi/bootloader-2712/default/pieeprom-2025-11-05.bin \
firmware-raspberrypi/bootloader-2712/default/pieeprom-2025-12-08.bin \
firmware-raspberrypi/bootloader-2712/default/recovery.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-05-08.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-06-13.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-06-20.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-06-29.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-07-03.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-07-17.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-08-13.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-08-20.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-08-27.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-09-22.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-09-23.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-09-25.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-10-08.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-10-17.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-11-05.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-11-21.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-11-27.bin \
firmware-raspberrypi/bootloader-2712/latest/pieeprom-2025-12-08.bin \
firmware-raspberrypi/bootloader-2712/latest/recovery.bin \
raspberrypi-eeprom-firmware \
raspberrypi-firmware-eeprom"

RDEPENDS:${PN} += "raspberrypi-eeprom"

inherit rpm
