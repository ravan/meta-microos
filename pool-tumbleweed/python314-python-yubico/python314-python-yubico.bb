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

RPM_NAME = "python314-python-yubico-1.3.3-3.5.noarch.rpm"
RPM_HASH = "6dd74bdb0fe12cc7de7d185b1716d2bd8d6c2f582a881d4873140edf5c2841bd71c0c28f573fab8794dddadfe96d7c3cb533eb5122b584881b33c5c80e3a0dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-yubico \
python314-python-yubico \
python314-yubico \
python3dist-python-yubico"

RDEPENDS:${PN} += "python-abi \
python314-usb"

inherit rpm
