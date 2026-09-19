SUMMARY = "Python code for talking to Yubico's YubiKeys"
DESCRIPTION = "The YubiKey is a hardware token for authentication. The main mode of the YubiKey \
is entering a one time password (or a strong static password) by acting as a USB HID device, \
but there are things one can do with bi-directional communication: \
 \
 1. Configuration. The yubikey_config class should be a feature-wise complete implementation \
    of everything that can be configured on YubiKeys version 1.3 to 3.x (besides deprecated \
    functions in YubiKey 1.x). See examples/configure_nist_test_key for an example. \
 2. Challenge-response. YubiKey 2.2 and later supports HMAC-SHA1 or Yubico challenge-response \
    operations. See examples/nist_challenge_response for an example."
LICENSE = "BSD-2-Clause"

PV = "1.3.3"

RPM_NAME = "python313-python-yubico-1.3.3-3.5.noarch.rpm"
RPM_HASH = "a65961e59860259270bdcbc26a9e1b967625e7419dd1c24279ef25a28c2c27162ae5cc02cc5b7ca3e3428ba8daf7e2473a0de9b3a482b9180ace9d4ab67e664e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-yubico \
python3-yubico \
python3.13dist-python-yubico \
python313-python-yubico \
python313-yubico \
python3dist-python-yubico"

RDEPENDS:${PN} += "python-abi \
python313-usb"

inherit rpm
