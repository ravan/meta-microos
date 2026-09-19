SUMMARY = "Microsoft Azure Form Recognizer Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Form Recognizer is a cloud service that uses machine learning \
to recognize text and table data from form documents. It includes the following main \
functionalities: \
 \
 * Custom models - Recognize field values and table data from forms. These models are \
   trained with your own data, so they're tailored to your forms. \
 * Content API - Recognize text and table structures, along with their bounding box coordinates, \
   from documents. Corresponds to the REST service's Layout API. \
 * Prebuilt receipt model - Recognize data from USA sales receipts using a prebuilt model."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "python313-azure-ai-formrecognizer-3.3.3-1.9.noarch.rpm"
RPM_HASH = "4b30e9678d94609f7d2bdb7b08ec42af9f71a4de5b2297a5b45fd32d0ab45dea762f5214f5f097d059c67f61cc022ccc24a085a901d7028e3500468efe70f371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-formrecognizer \
python3.13dist-azure-ai-formrecognizer \
python313-azure-ai-formrecognizer \
python3dist-azure-ai-formrecognizer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.23.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-ai-nspkg \
python313-msrest \
python313-typing-extensions"

inherit rpm
