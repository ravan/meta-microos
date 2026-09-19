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

RPM_NAME = "python314-azure-ai-formrecognizer-3.3.3-1.9.noarch.rpm"
RPM_HASH = "44c55ad25e3c5393db977665eb7cf12ff7e4a059019113e8d80eb3c6357c75e5084471894cb3e9f94e41af83c68583bb49bacc4cea471f5447d1faf06691a090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-formrecognizer \
python314-azure-ai-formrecognizer \
python3dist-azure-ai-formrecognizer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.23.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-ai-nspkg \
python314-msrest \
python314-typing-extensions"

inherit rpm
