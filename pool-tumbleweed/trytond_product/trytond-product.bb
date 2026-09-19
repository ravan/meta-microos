SUMMARY = "The 'product' module for the Tryton ERP system"
DESCRIPTION = "The Product module defines the following models in the Tryton \
application platform: Category of Unit of Measure, Unit of Measure, \
Product Template, Product and Product Category."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "trytond_product-7.0.5-1.2.noarch.rpm"
RPM_HASH = "837ccd59930c09d825a8028d40f6c6afe812cdda17f564cdf131b1c9a51f0e7ab1c88fbca21039a47c67ef8ca9b89238d51de4f2eae54baa302772f4b868530f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-product \
python3dist-trytond-product \
trytond-product"

RDEPENDS:${PN} += "python-abi \
trytond"

inherit rpm
