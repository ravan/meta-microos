SUMMARY = "Mock HTTP server based on the real Stripe API"
DESCRIPTION = "stripe-mock is a mock HTTP server based on the real Stripe API. It accepts \
the same requests and parameters that the Stripe API accepts, and rejects \
requests whose parameters are not recognized or have incorrect types. Its \
responses resemble the responses of the real Stripe API in terms of data \
type; however, stripe-mock does not attempt to reproduce the behavior of \
the real Stripe API at all."
LICENSE = "MIT"

PV = "0.201.0"

RPM_NAME = "stripe-mock-0.201.0-1.3.aarch64.rpm"
RPM_HASH = "ab94513fd8b7ce58e42d090382d6a5f8e76fd05bea2ca83baaac58b97a23d68e3b07fd6f1e7c185be09a41b236cab76ff18a49f11f83f18df195b372bebb2911"

RPROVIDES:${PN} += "stripe-mock"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
