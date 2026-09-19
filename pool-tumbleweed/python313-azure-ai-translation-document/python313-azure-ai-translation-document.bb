SUMMARY = "Microsoft Azure Document Translation Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Document Translation is a cloud service that translates documents \
to and from 90 languages and dialects while preserving document structure and data format. \
Use the client library for Document Translation to: \
 \
 * Translate numerous, large files from an Azure Blob Storage container to a target container \
   in your language of choice. \
 * Check the translation status and progress of each document in the translation operation. \
 * Apply a custom translation model or glossaries to tailor translation to your specific case."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-ai-translation-document-1.1.0-1.9.noarch.rpm"
RPM_HASH = "f3d6d40b6a1a1d77bd3c018b57c614b3d459852a74d9f6a9acb8cf9018fb9886070ee974fb87dc8a7886afda45b4868b2c2f5b46c1fcccf8e1cab500d829d723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-document \
python3.13dist-azure-ai-translation-document \
python313-azure-ai-translation-document \
python3dist-azure-ai-translation-document"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-nspkg \
python313-azure-ai-translation-nspkg \
python313-typing-extensions"

inherit rpm
