SUMMARY = "A helper library for termial colour printing for Erlang"
DESCRIPTION = "A helper library for termial colour printing extending the io:format syntax to add colours."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "erlang-cf-0.3.1-2.8.aarch64.rpm"
RPM_HASH = "d927f2dfd9752b1e01d0fc835481b9026d44eb54fa260588855ecf8dec29e591f9d9427328b998bd75830c0bcce869dd5c955b349adcca2ecccab366e957156e"

RPROVIDES:${PN} += "erlang-cf"

RDEPENDS:${PN} += "erlang"

inherit rpm
